abstract class child
{

  abstract void Iq();
}

 class student extends child{
  @Override
  void Iq(){
    System.out.println("Iq is low ");

  }

}

 class player extends child{
  @Override
  void Iq(){
    System.out.println("Iq is high ");
  }

}

class children{
  public static child typechild(String type){
    child c = null;
    if(type.equalsIgnoreCase("student")){
      c = new student();

    }
    else if (type.equalsIgnoreCase("player")) {
      c = new player();

    }
    return c;

  }
}


class A2{
  public static void main(String[] args) {
    child a = children.typechild("student");
    child b = children.typechild("player");
    a.Iq();
    b.Iq();
  }
}
