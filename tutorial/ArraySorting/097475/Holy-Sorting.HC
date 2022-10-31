U0 sort (U64* argv, U64 argc) {
I64 i = 0;
I64 j = 0;
for (i = 0; i < argc - 1; i++){
  for (j = i + 1; j < argc; j++){
    if (argv[j] < argv[i]){
      U64 tmp = argv[i];
      argv[i] = argv[j];
      argv[j] = tmp;
    }
  }
}
}

// RIP Terry 
