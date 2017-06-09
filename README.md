# Structure

### Stack
The stack implementation is in the src/main/java/com.cleverdevices.interview.codetest/stack/
* [HufStack](https://github.com/bhufsmith/CleverDevices/blob/master/src/main/java/com.cleverdevices.interview.codetest/stack/HufStack.java)
* [HufStackEmptyException](https://github.com/bhufsmith/CleverDevices/blob/master/src/main/java/com.cleverdevices.interview.codetest/stack/HufStackEmptyException.java)


### String manipulation 
The implementations for the string operation are in src/main/java/com.cleverdevices.interview.codetest/stringhelper/
* [StringHelper](https://github.com/bhufsmith/CleverDevices/blob/master/src/main/java/com.cleverdevices.interview.codetest/stringhelper/StringHelper.java)

The string methods include reversing the order of words in a sentence, and also finding common characters for two given strings. For finding common characters for the two given strings, there are two implementations. One will find all the characters that the words have in common, and only the characters. This means that no duplicates will be present, a character will appear once in the result string only if it appears at least once in both strings.  The second implementation takes the position of the letters into account, and will return a string containing all the characters where the two strings match by index. Characters will appear here, only if string1[i] equals sting2[i]  

### Tests
The package /src/test/java/com/cleverdevices/interview/codetest contains the classes with tests written for JUnit that execute when the code is compiled, and report any failture or success.  
* [HufStack Test](https://github.com/bhufsmith/CleverDevices/blob/master/src/test/java/com/cleverdevices/interview/codetest/stack/HufStackTest.java)  
* [Common Chars Test](https://github.com/bhufsmith/CleverDevices/blob/master/src/test/java/com/cleverdevices/interview/codetest/stringhelper/CommonCharsTest.java)  
* [Reverse Words Test]

### Build
This repository contains all the files needed to build and test the code. The project was set up using Gradle, and IntelliJ IDEA.  

To build and run the tests, clone the repository to your machine. 
Open a command terminal and browse to the directory for the project that you just cloned. 
The gradle wrapper can be used to compile this project if you do not have gradle installed. 

On linux, Mac or you will need to use (gradlew) in the root directory. 
You will also need to make sure the appropriate permissions are on the file for execution, if this did not work. 
**linux / Mac**
```
./gradlew clean build
```  
In a windows based environment you will use (gradlew.bat) 
```
gradlew.bat clean build
```
