package org.demoproject.demogol;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle; // For circular clipping
import javafx.scene.shape.Shape; // Base class for clip (optional if not using rectangle)
import javafx.scene.paint.Color; // For clip fill color (optional)
import javafx.scene.layout.StackPane; // For layout


public class CircleAvatarView extends StackPane {
///// for make imageview to circle for add image //////////////////////////////////
    private final ImageView imageView;
    private final Circle clip;

    public CircleAvatarView() {
        imageView = new ImageView();
        clip = new Circle();
        clip.setRadius(50.0); // Adjust radius as needed
        clip.setFill(Color.TRANSPARENT); // Optional: Set clip fill color
        setClip(clip); // Apply clip to the StackPane
        getChildren().add(imageView);
    }

    public void setImage(Image image) {
        imageView.setImage(image);
    }
}