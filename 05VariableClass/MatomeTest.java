public class MatomeTest {
  public class StrongBox<E> {
    private E newStrongBox;
    private KeyType keyType;
    private long count;

    private enum KeyType{
      PADLOCK, BUTTON, DIAL, FINGER
    }

    public StrongBox(KeyType keyType) {
      this.keyType = keyType;
    }
    public void put(E d) {
      this.newStrongBox = d;
    }
    public E get(){
      this.count++;
      switch (this.keyType) {
        case PADLOCK:
          if(count < 1024) return null;
          break;
        case BUTTON:
          if(count < 10000) return null;
          break;
        case DIAL:
          if(count < 30000) return null;
          break;
        case FINGER;
          if(count < 100000) return null;
          break;
      }
      this.count = 0;
      return this.newStrongBox;
    }
  }
}