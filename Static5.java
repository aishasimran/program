class Static5 {
public static void staticMethod() {
return; 
}
}
class Instance extends Static5 { 
Instance instance = new Instance();
instance.staticMethod(); // doesn't work
((Static5) instance).staticMethod(); // works with cast
}