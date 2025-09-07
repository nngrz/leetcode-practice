var sumZero = function(n) {
    const arr = [];

    if (n % 2 != 0) {
        arr.push (0);
    }

    for (let i = 1; i <= n / 2; i++) {
        arr.push(i);
        arr.push(-(i));
    }

   return arr;
};

sumZero(4);
