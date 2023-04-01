package com.study_matching.core.error;


import com.study_matching.core.error.dto.ErrorMessage;
import com.study_matching.core.error.dto.ErrorResponseDto;
import com.study_matching.core.error.exception.BusinessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    protected ResponseEntity<ErrorResponseDto> handleBusinessException(
        BusinessException exception) {
        ErrorMessage message = exception.getErrorMessage();
        return ErrorResponseDto.of(message);
    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ErrorResponseDto> handleException() {
        return ErrorResponseDto.of(ErrorMessage.INTERNAL_SERVER_ERROR);
    }
}