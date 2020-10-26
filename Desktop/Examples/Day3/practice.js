var a = 5;
var b = 10;
console.log("Fifteen is " + (a + b) + " and\nnot " + (2 * a + b) + ".");
// "Fifteen is 15 and
// not 20."

var a = 5;
var b = 10;
console.log(`Fifteen is ${a + b} and\nnot ${2 * a + b}.`);
// "Fifteen is 15 and
// not 20."


function tag(strings, ...values) {
  console.log(strings.raw[0]); 
  // "string text line 1 \n string text line 2"
}

tag`string text line 1 \n string text line 2`;


String.raw`Hi\n${2+3}!`;
// "Hi\n5!"