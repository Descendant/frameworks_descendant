package descendant.support.lottie.model.content;


import android.support.annotation.Nullable;

import descendant.support.lottie.LottieDrawable;
import descendant.support.lottie.animation.content.Content;
import descendant.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
