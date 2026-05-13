package service;

import dto.ReservationRequestDto;
import dto.ReservationResponseDto;

import java.util.List;

public interface ReservationService {

    List<ReservationResponseDto> findAll();
    ReservationResponseDto findById(Long id);
    List<ReservationResponseDto> findByTableId(Long tableId);
    List<ReservationResponseDto> findByTableIdAndDinerId(Long tableId, Long dinerId);
    List<ReservationResponseDto> findByDinerId(Long dinerId);
    ReservationResponseDto create(ReservationRequestDto reservation);
    ReservationResponseDto update(ReservationRequestDto reservation);
    boolean delete(Long id);
}