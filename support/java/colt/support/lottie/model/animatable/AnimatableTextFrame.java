package colt.support.lottie.model.animatable;

import colt.support.lottie.value.Keyframe;
import colt.support.lottie.animation.keyframe.TextKeyframeAnimation;
import colt.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}
