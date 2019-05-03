package colt.support.lottie.animation.keyframe;

import colt.support.lottie.value.Keyframe;

import java.util.List;

abstract class KeyframeAnimation<T> extends BaseKeyframeAnimation<T, T> {
  KeyframeAnimation(List<? extends Keyframe<T>> keyframes) {
    super(keyframes);
  }
}
