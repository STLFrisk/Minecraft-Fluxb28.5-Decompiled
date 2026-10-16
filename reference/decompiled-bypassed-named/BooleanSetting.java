public class BooleanSetting extends Setting {
   public BooleanSetting(String var1, String var2, Boolean var3) {
      this.rn2 = var1;
      this.h4c = var2;
      this.ktv = var3;
      SettingRegistry.wig.add(this);
   }

   public Boolean getValue() {
      return (Boolean)this.ktv;
   }

   @Override
   public void setValueRaw(Object var1) {
      super.setValueRaw(var1);
   }

   public boolean g7m() {
      return this.getValue();
   }

   @Override
   public Object getValue() {
      return this.getValue();
   }
}
