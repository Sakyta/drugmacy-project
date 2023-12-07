-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 07, 2023 at 04:10 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_drugmacy`
--

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `id_obat` varchar(10) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `harga` bigint(20) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`id_obat`, `nama`, `harga`, `stok`) VALUES
('ACD', 'Antibiotik', 10000, 27),
('MAD', 'Mylanta', 25000, 12),
('PCT', 'Paracetamol', 20000, 14),
('SFD', 'Sulfonamida', 50000, 6),
('VTC', 'Vectrine', 40000, 6);

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `kontak` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `kode` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama`, `alamat`, `kontak`, `username`, `password`, `kode`) VALUES
('001', 'Nurkahfi Amran Rahmada', 'Bogor', '0812345678', 'nurkahfi', 'kahfi123', 1),
('002', 'Anel Fuad Abiyyu', 'Indramayu', '01256', 'anel', 'anel123', 2),
('003', 'Tabina Adelia Rafa', 'Bekasi', '0812345678', 'tabina', 'tabina123', 1),
('100', 'Candra', 'Jakarta', '0123442954', 'candra', 'candra123', 2),
('200', 'Adnan', 'Bogor', '9291023', 'adnan', 'adnan123', 2);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `kontak` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `nama`, `kontak`, `alamat`) VALUES
('101', 'Umar', '08123499824', 'Depok'),
('102', 'Satria', '2113012840', 'Bandung'),
('105', 'Ivan', '294732', 'Bandung'),
('110', 'Josef', '12902391', 'Jakarta'),
('120', 'Nugrah', '903248347', 'Cirebon');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `id_penjualan` varchar(10) NOT NULL,
  `tgl_jual` varchar(10) NOT NULL,
  `total` varchar(20) NOT NULL,
  `nama_pegawai` varchar(50) NOT NULL,
  `nama_pelanggan` varchar(50) NOT NULL,
  `nama_obat` varchar(50) NOT NULL,
  `jumlah_beli` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`id_penjualan`, `tgl_jual`, `total`, `nama_pegawai`, `nama_pelanggan`, `nama_obat`, `jumlah_beli`) VALUES
('O4I5F1', '2023-12-07', '170,000', 'Candra', 'Ivan', 'Antibiotik', 5),
('O4I5F1', '2023-12-07', '170,000', 'Candra', 'Ivan', 'Vectrine', 3),
('B7D5E5', '2023-12-07', '145,000', 'Candra', 'Josef', 'Mylanta', 3),
('B7D5E5', '2023-12-07', '145,000', 'Candra', 'Josef', 'Sulfonamida', 1),
('B7D5E5', '2023-12-07', '145,000', 'Candra', 'Josef', 'Paracetamol', 1),
('T1R0A0', '2023-12-07', '100,000', 'Candra', 'Umar', 'Paracetamol', 2),
('T1R0A0', '2023-12-07', '100,000', 'Candra', 'Umar', 'Antibiotik', 4),
('T1R0A0', '2023-12-07', '100,000', 'Candra', 'Umar', 'Paracetamol', 1),
('X5B3J9', '2023-12-07', '90,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Paracetamol', 2),
('X5B3J9', '2023-12-07', '90,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Mylanta', 2),
('E0R6Z7', '2023-12-07', '40,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Antibiotik', 4),
('D8G8H4', '2023-12-07', '70,000', 'Tabina Adelia Rafa', 'Umar', 'Antibiotik', 2),
('D8G8H4', '2023-12-07', '70,000', 'Tabina Adelia Rafa', 'Umar', 'Sulfonamida', 1),
('X4C0H4', '2023-12-07', '80,000', 'Candra', 'Satria', 'Antibiotik', 3),
('X4C0H4', '2023-12-07', '80,000', 'Candra', 'Satria', 'Mylanta', 2),
('X7S6Z9', '2023-12-07', '10,000', 'Adnan', 'Umar', 'Antibiotik', 1),
('W0H8G2', '2023-12-07', '40,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Paracetamol', 2),
('O5X5Z8', '2023-12-07', '25,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Mylanta', 1),
('F6T5J9', '2023-12-07', '135,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Vectrine', 1),
('F6T5J9', '2023-12-07', '135,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Sulfonamida', 1),
('F6T5J9', '2023-12-07', '135,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Mylanta', 1),
('F6T5J9', '2023-12-07', '135,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Paracetamol', 1),
('R1N5T2', '2023-12-07', '55,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Antibiotik', 1),
('R1N5T2', '2023-12-07', '55,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Mylanta', 1),
('R1N5T2', '2023-12-07', '55,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Paracetamol', 1),
('Q5R2M4', '2023-12-07', '170,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Antibiotik', 2),
('Q5R2M4', '2023-12-07', '170,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Vectrine', 2),
('Q5R2M4', '2023-12-07', '170,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Sulfonamida', 1),
('Q5R2M4', '2023-12-07', '170,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Paracetamol', 1),
('U5Z7P2', '2023-12-07', '135,000', 'Candra', 'Ivan', 'Mylanta', 1),
('U5Z7P2', '2023-12-07', '135,000', 'Candra', 'Ivan', 'Paracetamol', 1),
('U5Z7P2', '2023-12-07', '135,000', 'Candra', 'Ivan', 'Vectrine', 1),
('U5Z7P2', '2023-12-07', '135,000', 'Candra', 'Ivan', 'Sulfonamida', 1),
('Z8P2X9', '2023-12-07', '145,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Mylanta', 1),
('Z8P2X9', '2023-12-07', '145,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Paracetamol', 1),
('Z8P2X9', '2023-12-07', '145,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Antibiotik', 1),
('Z8P2X9', '2023-12-07', '145,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Vectrine', 1),
('Z8P2X9', '2023-12-07', '145,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Sulfonamida', 1),
('C2I9Z8', '2023-12-07', '145,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Antibiotik', 1),
('C2I9Z8', '2023-12-07', '145,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Mylanta', 1),
('C2I9Z8', '2023-12-07', '145,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Paracetamol', 1),
('C2I9Z8', '2023-12-07', '145,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Sulfonamida', 1),
('C2I9Z8', '2023-12-07', '145,000', 'Nurkahfi Amran Rahmada', 'Umar', 'Vectrine', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`id_obat`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
