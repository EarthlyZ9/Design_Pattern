public class Moving {
    private MovableStrategy movableStrategy;

    public void move() {
        // delegate -> move 라는 함수의 실행을 위임함
        movableStrategy.move();
    }

    public void setMovableStrategy(MovableStrategy movableStrategy) {
        this.movableStrategy = movableStrategy;
    }
}
