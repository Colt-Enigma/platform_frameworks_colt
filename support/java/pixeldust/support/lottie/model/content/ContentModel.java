package pixeldust.support.lottie.model.content;


import android.support.annotation.Nullable;

import pixeldust.support.lottie.LottieDrawable;
import pixeldust.support.lottie.animation.content.Content;
import pixeldust.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
