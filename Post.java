public class Post {
    public void posting() {
        System.out.println("Your post is posted.");
    }

    public void commenting() {
        System.out.println("Enter your comment:");
    }

    public static class TextPost extends Post {
        @Override
        public void posting() {
            super.posting();
            System.out.println("Post is of text type.");
        }

        @Override
        public void commenting() {
            super.commenting();
            System.out.println("Comment is of text type.");
        }
    }

    public static class ImagePost extends Post {
        @Override
        public void posting() {
            super.posting();
            System.out.println("Your post is of image type.");
        }

        @Override
        public void commenting() {
            super.commenting();
            System.out.println("Your comment is of image type.");
        }
    }

    public static void main(String[] args) {
        Post p1 = new Post();
        TextPost t1 = new TextPost();
        ImagePost i1 = new ImagePost();

        System.out.println("Text Post:");
        t1.posting();
        t1.commenting();

        System.out.println("\nImage Post:");
        i1.posting();
        i1.commenting();
    }
}


