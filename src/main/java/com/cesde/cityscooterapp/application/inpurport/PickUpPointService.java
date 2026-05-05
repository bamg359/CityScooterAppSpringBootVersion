package com.cesde.cityscooterapp.application.inpurport;

import com.cesde.cityscooterapp.domain.PickUpPoint;
import java.util.List;

public interface PickUpPointService {

    PickUpPoint createPickUpPoint(PickUpPoint pickUpPoint);

    PickUpPoint updatePickUpPoint(PickUpPoint pickUpPoint);

    List<PickUpPoint> getAllPickUpPoints();

    PickUpPoint getPickUpPointById(Integer idPoint);

    Boolean deletePickUpPoint(Integer idPoint);



}
