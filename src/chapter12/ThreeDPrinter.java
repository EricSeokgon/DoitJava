package chapter12;

public class ThreeDPrinter {
    public class GenericPrinter<T> {
        private T material;

        public T getMaterial() {
            return material;
        }

        public void setMaterial(T material) {
            this.material = material;
        }
    }
}
