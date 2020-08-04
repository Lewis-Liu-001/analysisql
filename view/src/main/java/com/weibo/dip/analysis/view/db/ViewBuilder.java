package com.weibo.dip.analysis.view.db;

import com.weibo.dip.analysis.view.DefaultView;
import java.util.Objects;

/** ViewBuilder. */
public class ViewBuilder {
  private String topic;

  private DefaultView view = null;

  public ViewBuilder() {}

  public String getTopic() {
    return topic;
  }

  /**
   * Set view topic.
   *
   * @param topic topic
   * @return builder
   */
  public ViewBuilder topic(String topic) {
    this.topic = topic;

    if (Objects.isNull(view)) {
      view = new DefaultView(topic);
    }

    return this;
  }

  /**
   * Set view alias.
   *
   * @param alias alias
   * @return builder
   */
  public ViewBuilder alias(String alias) {
    view.setAlias(alias);

    return this;
  }

  /**
   * Set view desc.
   *
   * @param desc desc
   * @return builder
   */
  public ViewBuilder desc(String desc) {
    view.setDesc(desc);

    return this;
  }

  /**
   * Add view dimension.
   *
   * @param name dimension name
   * @param alias dimension alias
   * @param desc dimension desc
   * @return builder
   */
  public ViewBuilder dimension(String name, String alias, String desc) {
    view.addDimension(name, alias, desc);

    return this;
  }

  /**
   * Add view metric.
   *
   * @param name metric name
   * @param alias metric alias
   * @param desc metric desc
   * @return builder
   */
  public ViewBuilder metric(String name, String alias, String desc) {
    view.addMetric(name, alias, desc);

    return this;
  }

  public DefaultView build() {
    return view;
  }
}
