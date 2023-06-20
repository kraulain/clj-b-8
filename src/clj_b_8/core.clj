
(ns clj-b-8.core)

;; Accessing Java Methods

(.toString x) ;; Java: x.toString();

(.addToVec v1 v2) ;; Java: v1.addtoVec(v2);

;; Accessing java fields

(.-x point) ;;Java: point.x

(set! (.-x point) 100) ;; Java: point.x = 100;

;; Accession static methods

System

(System/currentTimeMillis) ;;Java: System.currentTimeMillis();

;; Instantiating java objects

(java.util.Date.) ;; Java: new java.util.Date()

(java.util.Date. (System/currentTimeMillis)) ;;Java: new java.util.Date(System/currentTimeMillis());

(new java.util.Date)


;; Accessing enums

java.nio.charset.StandardCharsets

(java.nio.charset.StandardCharsets/UTF_8)

