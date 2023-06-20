
(ns clj-b-8.core)

;; Accessing Java Methods

(.toString x) ;; Java: x.toString();

(.addToVec v1 v2) ;; Java: v1.addtoVec(v2);


;; Accessing java fields

(.-x point) ;;Java: point.x


;; Accession static methods

(System/currentTimeMillis) ;;Java: System.currentTimeMillis();



