package org.springframework.social.fanapium.api.impl.json;

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.social.fanapium.api.model.CustomPost;
import org.springframework.social.fanapium.api.model.TimelineItem;
import org.springframework.social.fanapium.api.model.UserPostInfo;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/2/17.
 */
public class FanapiumModule extends SimpleModule {

    private static final long serialVersionUID = 1L;

    public FanapiumModule() {
        super("FanapiumModule");
    }

    @Override
    public void setupModule(SetupContext context) {
        context.setMixInAnnotations(UserPostInfo.class, UserPostInfoMixin.class);
        context.setMixInAnnotations(TimelineItem.class, TimelineItemMixin.class);
        context.setMixInAnnotations(CustomPost.class, CustomPostMixin.class);
        super.setupModule(context);
    }
}
