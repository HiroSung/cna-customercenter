package local;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MypageRepository extends CrudRepository<Mypage, Long> {

    List<Mypage> findByOrderId(Long orderId);
    List<Mypage> findByDeliveryId(Long deliveryId);
    void deleteByOrderId(Long orderId);
}