# SplashScreen

- Type 1 No RUN UI
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

- Type 2 RUN UI
```java
new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        ///action
    }
}, 4000);
```

---

```
Copyright 2020 M. Fadli Zein
```
