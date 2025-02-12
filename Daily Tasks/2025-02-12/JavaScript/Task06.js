function leapyear(year) {
    return (year % 100 === 0) ? (year % 400 === 0) : (year % 4 === 0);
}

console.log(`Is 2016 a leap year? ${leapyear(2016)}`);
console.log(`Is 2018 a leap year? ${leapyear(2018)}`);