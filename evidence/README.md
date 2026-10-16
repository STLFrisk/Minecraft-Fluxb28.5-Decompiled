# evidence/

`scripts/verify.ps1` 每次运行都会刷新这里的文件。它们是**原始证据**，
不是结论摘要——文档里的每一条断言都应该能在这里找到对应记录。

| 文件 | 由谁产生 | 说明 |
|---|---|---|
| `validation_reachability.txt` | `tools/validate_patch.py` | 控制流可达性证明：登录块不可达、菜单跳转 `[32, 60]` 均可达；根集合 = 方法入口 + 全部 10 个异常处理器起始 PC |
| `jvm_verification.txt` | `tools/VerifyPatch.java` | 两个发行 jar 的类链接 + 字节码校验结果 |
| `jvm_verification_control.txt` | 同上（畸形补丁） | **对照**：故意改错的 `goto` 偏移必须被 `VerifyError` 拒绝 |
| `dynamic_test_control.txt` | `tools/DynamicGateTest.java` | **对照**：门禁完好的构建，`drawScreen` 进入 `qih.<init>` |
| `dynamic_test_patched.txt` | 同上（补丁版） | 补丁构建，`qih` 从未被解析/实例化 |
| `q08_drawScreen_original.javap.txt` | `javap -c -p` | 原始方法反汇编 |
| `q08_drawScreen_patched.javap.txt` | 同上（补丁后） | 补丁后反汇编，可直接对照 |
| `native_gate_patch_report.tsv` | `tools/patch_native.py` | `v6ma.Ex` 中和清单：14 个类、类 / 方法 / 两条偏移 |
| `decrypted_strings.tsv` | `tools/DumpStrings.java` | 14,315 条解密字面量的原始输出 |
| `decryption_failures.tsv` | 同上 | 未能解密的 1,779 个调用点及原因（绝大多数是 OptiFine 类的注册表门禁） |

## 与 `mappings/` 的关系

`decrypted_strings.tsv` 是夹具的**原始输出**；
`mappings/strings.tsv` 是同一批数据经 `tools/gen_mappings.py` 归一化后的版本。
两者内容一致，保留前者是为了让 `evidence/` 自成闭环——即使 `mappings/` 被重新生成，
你仍然能看到当时到底解出了什么。

## 复现

```powershell
powershell -ExecutionPolicy Bypass -File ..\scripts\verify.ps1
```

脚本退出码非 0 表示有检查未通过，并在末尾列出失败项。

## 一个容易误读的地方

`dynamic_test_patched.txt` 里 `qih resolved during call: false` 是**预期的**：
补丁让登录块不可达，所以 JVM 根本不需要解析 `qih` 这个类。
判据是"`qih` 是否在 `drawScreen` 执行期间被解析、或出现在异常栈里"，
两者都为否才算绕过成立——见 `tools/DynamicGateTest.java` 的注释。

如果输出是 `VERDICT: INCONCLUSIVE`，说明 `zwr` 未能初始化（通常是
`flux:*` 库不在 classpath 上），此时**门禁根本没被求值**，
既不能算通过也不能算失败。脚本会把它当作失败处理。
