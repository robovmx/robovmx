// Weak stub has to be located in separate .o file. from place where its invoked
#if defined(DARWIN)
__attribute__ ((weak)) void registerDarwinExceptionHandler(void) {
}
#endif
