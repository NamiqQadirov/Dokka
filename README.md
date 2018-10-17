 Dokka Library for KDOC
 This library is for Dokka Kotlin documentation library.
 
 This is foundation project for learning dokka Documentation library

<h3> Setup instructions</h3>
 <ul>
  <li>
 add  classpath "org.jetbrains.dokka:dokka-gradle-plugin:0.9.17" as following in porject's build.gradle
   </br>
 dependencies { </br>
        . </br>
        . </br>
        classpath "org.jetbrains.dokka:dokka-gradle-plugin:0.9.17" // You should change version to last</br>
    }  
 </li>
  <li> 
 add    </br>
apply plugin: 'org.jetbrains.dokka' to head of app's build.gradle
 </li>
  <li> 
   add dokka task as following   
</br>
   android {   </br>
   .   </br>
   .   </br>
   .   </br>
task dokka(overwrite: true, type: org.jetbrains.dokka.gradle.DokkaTask) {</br>
        outputFormat = 'html'</br>
        outputDirectory = "$buildDir/dokka"</br>
        packageOptions {</br>
            prefix = "android"</br>
            suppress = true</br>
        }</br>
        packageOptions {</br>
            prefix = "br.az.dokkatest"</br>
            suppress = false</br>
         }</br>
    }   </br>
   .   </br>
   .   </br>
   .   </br>
   }   </br>
 </li>
 </ul> 

    
