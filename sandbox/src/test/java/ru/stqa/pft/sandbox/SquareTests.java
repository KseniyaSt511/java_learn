package ru.stqa.pft.sandbox;

public class SquareTests {

  public void testArea() {
    Square s = new Square (5);
    assert s.area() == 25;
  }
}