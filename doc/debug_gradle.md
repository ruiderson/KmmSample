To debug gradle on Android Studio add an default "Remote" configuration with "Gradle" name on "Edit Configurations"

On terminal, run the command
./gradlew help -Dorg.gradle.debug=true --no-daemon

Then, go to Android Studio "Run" menu, and click "Debug 'Gradle'"