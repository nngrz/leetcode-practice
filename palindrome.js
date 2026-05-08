var isPalindrome = function(x) {

    if (x >= 0) {
        const arr = [];
        do {
            let digit = x % 10;
            arr.push(digit);
            x = Math.floor(x / 10);
        } while (x > 0)

        const arrLength = arr.length;
        for (let i = 0; i < arrLength / 2; i++) {
            if (arr[i] !== arr[arrLength - (i + 1)]) {
                return false;
            }
        }
        return true;
    }

    return false;
};

// console.log(isPalindrome(121));
// console.log(isPalindrome(-121));
console.log(isPalindrome(10));