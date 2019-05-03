package colt.support.lottie.model.content;


import android.support.annotation.Nullable;

import colt.support.lottie.LottieDrawable;
import colt.support.lottie.animation.content.Content;
import colt.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
