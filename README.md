# LibraryDemo
Custom Toast Library

this is teh first library for me on github 

# Gradle Version 1.0

dependencies {
    ...
    implementation 'com.github.diaanajjar95:LibraryDemo:1.0'
}

# Gradle Version 1.1

dependencies {
    ...
    implementation 'com.github.diaanajjar95:LibraryDemo:1.1'
}
 
# Usage Version 1.0

CustomToastMessage.showToast(this,"wa7",4)

# Usage Version 1.1
 /**
     * 
     * @param context Your Activity or Fragment Context 
     * @param message Your Message 
     * @param duration Your Duration As an Integer Value 
     * @param inflater getLayoutInflater From A Class Extends AppCompatActivity or related Classes 
     * @param imageResource R.drawable.image Any Image Exist inside You Drawable file 
     */
CustomToastMessage(this).showToast(this, "Wa7", 3,layoutInflater, R.drawable.ic_error_black_24dp)


