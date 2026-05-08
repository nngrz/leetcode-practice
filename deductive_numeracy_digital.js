// Generate all k-length permutations of digits 1..9 (no repeats)
function* permuteK(k, digits = [1,2,3,4,5,6,7,8,9]) {
  const used = Array(digits.length).fill(false);
  const pick = [];
  function* dfs() {
    if (pick.length === k) { yield pick.slice(); return; }
    for (let i = 0; i < digits.length; i++) {
      if (used[i]) continue;
      used[i] = true;
      pick.push(digits[i]);
      yield* dfs();
      pick.pop();
      used[i] = false;
    }
  }
  yield* dfs();
}

/**
 * Generic digit-challenge solver.
 * @param {number} slots - how many blanks in the expression
 * @param {(xs:number[])=>number} expr - computes LHS from chosen digits (xs[0]..xs[n-1])
 * @param {number} target - value RHS must equal
 * @returns {number[][]} all digit tuples that satisfy expr(xs) === target
 */
function solveDigitChallenge(slots, expr, target) {
  const out = [];
  for (const xs of permuteK(slots)) {
    if (expr(xs) === target) out.push(xs);
  }
  return out;
}

// const sols1 = solveDigitChallenge(3, ([A,B,C]) => A + B*C, 46);
// console.log("Sols 1: ", sols1);

// const sols2 = solveDigitChallenge(4, ([A,B,C,D]) => A*B - C - D, 55);
// console.log("Sols 2: ", sols2);

// const sols3 = solveDigitChallenge(4, ([A,B,C,D]) => A - B + C - D, 14);
// console.log("Sols 3: ", sols3);
