interface Animal
{
  void type();
}

 class Test {
  public static void main(String args[])
 {
    Animal an = new Animal() {
      public void type()
      {
        System.out.println("Annonymous animal");
      }
    };
    an.type();
  }
}
