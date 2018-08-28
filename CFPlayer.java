package hw4;

public interface CFPlayer{

  int nextMove(CFGame g);
  
  //return value of getName cannot be "draw"
  String getName();

}