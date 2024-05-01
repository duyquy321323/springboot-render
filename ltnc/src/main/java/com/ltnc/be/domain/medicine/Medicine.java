package com.ltnc.be.domain.medicine;

import com.ltnc.be.domain.BaseEntity;
import com.ltnc.be.domain.prescriptionMedicine.PrescriptionMedicine;
import jakarta.persistence.*;
import java.util.List;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "medicine")
public class Medicine extends BaseEntity {
  @Column(name = "name", unique = true, nullable = false)
  private String name;

  @Enumerated(EnumType.STRING)
  @Column(name = "medicine_type")
  private MedicineType medicineType;

  @Enumerated(EnumType.STRING)
  @Column(name = "medicine_use_type")
  private MedicineUseType medicalUseType;

  @Column(name = "price")
  private String price;

  @Column(name = "ingredient")
  private String ingredient;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "medicine")
  private List<PrescriptionMedicine> prescriptionMedicineList;
}
