function bubbleSort(inputArray) {
  for (let i = 0; i < inputArray.length; i++) {
     for (let j = 0; j < inputArray.length - i - 1; j++) {
      if (inputArray[j] > inputArray[j + 1]) {
        let temp = inputArray[j];
        inputArray[j] = inputArray[j + 1];
        inputArray[j + 1] = temp;
      }
    }
  }
}

const test = [15, -2, 7, -1, -100, 89];
console.log(test);
bubbleSort(test);
console.log(test);
