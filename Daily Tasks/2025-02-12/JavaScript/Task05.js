var str = 'digiterati';

for (var i = 0; i <= str.length; i++) {
    str = str[str.length - 1] + str.substring(0, str.length - 1);
    console.log(str);
}