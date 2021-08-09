package org.facboy.mapstruct;

import org.mapstruct.Mapper;

@Mapper(uses = MapstructSupport.class)
public abstract class OptionalBeanMapper {

  public abstract OptionalLongBean toOptionalBean(LongBean longBean);
}
