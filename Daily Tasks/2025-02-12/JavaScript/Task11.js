function convertToFahrenheit(celsius) {
    return (celsius * 9/5) + 32;
}

function convertToCelsius(fahrenheit) {
    return (fahrenheit - 32) * 5/9;
}

var celsius = 60; 
console.log(`${celsius}°C is ${convertToFahrenheit(celsius)}°F`);

var fahrenheitInput = 45; 
console.log(`${fahrenheitInput}°F is ${convertToCelsius(fahrenheitInput)}°C`);
