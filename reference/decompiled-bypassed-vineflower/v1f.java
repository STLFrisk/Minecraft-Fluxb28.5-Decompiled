public final class v1f extends RuntimeException {
   public static final v1f ln6 = new v1f();

   @Override
   public synchronized Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
