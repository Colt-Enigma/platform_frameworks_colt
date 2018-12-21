package pixeldust.support.lottie.model.animatable;

import android.graphics.Path;

import pixeldust.support.lottie.value.Keyframe;
import pixeldust.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import pixeldust.support.lottie.animation.keyframe.ShapeKeyframeAnimation;
import pixeldust.support.lottie.model.content.ShapeData;

import java.util.List;

public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {

  public AnimatableShapeValue(List<Keyframe<ShapeData>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ShapeData, Path> createAnimation() {
    return new ShapeKeyframeAnimation(keyframes);
  }
}
