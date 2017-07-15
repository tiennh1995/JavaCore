package datastructures;

public class NodePoly {
  int[] data = new int[2];
  NodePoly nextNode;

  public NodePoly(int coefficient, int exponent) {
    this(coefficient, exponent, null);
  }

  public NodePoly(int coefficient, int exponent, NodePoly next) {
    this.data[0] = coefficient;
    this.data[1] = exponent;
    this.nextNode = next;
  }
}
