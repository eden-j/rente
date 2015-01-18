(ns rente.config
  (:require [environ.core :refer [env]]))

(defn get-config []
  {:port (Integer/parseInt (or (env :rente-port) "8080"))})
