# SplashScreen


```java
Thread timer = new Thread(){
    public void run(){
        try{
            sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Intent intent = new Intent(getApplicationContext(), SplashScreenExerSecond.class);
            startActivity(intent);
            SplashScreenExerFirst.this.finish();
        }
    }
};
timer.start();

```
---

```
Copyright 2020 M. Fadli Zein
```
