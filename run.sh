clear
cd src
printf "Compiling..."
javac -d bin consola/*.java logica/*.java
if [ $? == 0 ] 
then
    clear
    java -cp bin consola.Principal
else
    printf "\n\n\nError - Exit code $?"
fi


