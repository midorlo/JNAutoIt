# JNAutoIt - Java Native Access for AutoIt


![Build](https://img.shields.io/appveyor/ci/midorlo/JNAutoit.svg) ![License](https://img.shields.io/badge/license-APACHE-blue.svg)


## Basic Overview


This project aims to bring AutoIt functionality to Java. To do so, it wraps [AutoItX](https://documentation.help/AutoItX/) via [Java Native Access](https://github.com/java-native-access/jna). It should serve as a successor of [accessrichard/autoitx4java](https://github.com/accessrichard/autoitx4java). 


## Building from source

```maven
mvn clean install
```

This will require a windows >=8 host. 

### Dependencies

* [Java Native Access](https://github.com/java-native-access/jna) 
* [TestNG](https://testng.org/doc/index.html)
* [AutoItX(Bundled)](https://www.autoitscript.com/site/autoit/downloads/)

## Usage


```java
import de.midorlo.jnautoit.jna.AutoItX;
..
AutoItX aix = AutoItX.getInstance();
aix.AU3_MouseMove(640, 480);
```

        
