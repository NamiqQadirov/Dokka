 Dokka Library for KDOC
 This library is for Dokka Kotlin documentation library.
 
 This is foundation project for learning dokka Documentation library

<h3> Setup instructions</h3>
 <ul>
  <li>
 add  classpath "org.jetbrains.dokka:dokka-gradle-plugin:0.9.17" as following in porject's build.gradle
 dependencies {
        .
        .
        classpath "org.jetbrains.dokka:dokka-gradle-plugin:0.9.17"
    }
 </li>
  <li> 
 add apply plugin: 'org.jetbrains.dokka' to head of app's build.gradle
 </li>
  <li> 
   add dokka task as following 
   android {
   .
   .
   .
task dokka(overwrite: true, type: org.jetbrains.dokka.gradle.DokkaTask) {
        outputFormat = 'html'
        outputDirectory = "$buildDir/dokka"
        packageOptions {
            prefix = "android"
            suppress = true
        }
        packageOptions {
            prefix = "br.az.dokkatest"
            suppress = false
         }
    }
   .
   .
   .
   }
 </li>
 </ul> 

    
