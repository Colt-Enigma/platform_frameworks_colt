package colt.support.lottie.model.animatable;

import android.graphics.Path;

import colt.support.lottie.value.Keyframe;
import colt.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import colt.support.lottie.animation.keyframe.ShapeKeyframeAnimation;
import colt.support.lottie.model.content.ShapeData;

import java.util.List;

public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {

  public AnimatableShapeValue(List<Keyframe<ShapeData>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ShapeData, Path> createAnimation() {
    return new ShapeKeyframeAnimation(keyframes);
  }
}
