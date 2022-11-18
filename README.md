# class18-11
## kata task1

[Task link](https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad)

My solution
```java
 public class Kata {
    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];
        }
        return array;
    }
}
```

My fav solution
```java
public class Kata {
  public static int[] invert(int[] array) {
    return java.util.Arrays.stream(array).map(i -> -i).toArray();
  }
}
```

## kata task2

[Task link](https://www.codewars.com/kata/525e5a1cb735154b320002c8)

My solution
```java
public class Triangular {
    public static long triangular(long n) {
      long result=0;
      for(int i=0; i<=n; i++){
        result=result+i;
      }
      return result;
    }
}
```

My fav solution
```java
public class Triangular {
    public static int triangular(int n) {
        return (n <= 0) ? 0 : n * (n + 1) / 2;
    }
}
```
