-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 28 Nov 2023 pada 16.50
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

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
-- Struktur dari tabel `obat`
--

CREATE TABLE `obat` (
  `id_obat` int(11) NOT NULL COMMENT 'Primary key',
  `kode_obat` varchar(20) NOT NULL COMMENT 'unique, di gumakam untuk identifikasi obat',
  `nama_obat` varchar(100) NOT NULL COMMENT 'Nama obat',
  `kategori_obat` varchar(15) NOT NULL COMMENT 'Kategori obat, seperti obat generik, obat bebas, obat resep, dll',
  `jenis_obat` varchar(20) NOT NULL COMMENT 'Jenis obat, seperti obat oral, obat suntik, obat tetes, dll',
  `merek_obat` varchar(100) NOT NULL COMMENT 'Merek obat',
  `harga_beli_obat` decimal(10,0) NOT NULL COMMENT 'Harga beli obat suplier',
  `harga_jual_obat` decimal(10,0) NOT NULL COMMENT 'harga jual obat kepada konsumen',
  `stok_obat` int(11) NOT NULL COMMENT 'Jumlah stok obat',
  `tanggal_masuk` timestamp NOT NULL DEFAULT current_timestamp() COMMENT 'Tanggal masuk obat ke gudang ',
  `expired` date NOT NULL COMMENT 'Tanggal kadaluarsa obat'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL COMMENT 'Primary key',
  `id_obat` int(11) NOT NULL COMMENT 'Foreign key ke tabel obat',
  `id_user` int(11) NOT NULL COMMENT 'foreign key ke table user',
  `jumlah_obat` int(11) NOT NULL COMMENT 'Jumlah obat yang di beli',
  `total_harga` decimal(10,0) NOT NULL COMMENT 'Total harga transaksi',
  `tanggal_transaksi` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT 'Tanggal transaksi'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL COMMENT 'Primary key',
  `nama` varchar(100) NOT NULL COMMENT 'Nama lengkap pengguna',
  `jenis_kelamin` varchar(15) NOT NULL COMMENT 'Jenis Kelamin',
  `username` varchar(20) NOT NULL COMMENT 'Username Pengguna',
  `password` varchar(255) NOT NULL COMMENT 'Password Pengguna',
  `akses` varchar(15) NOT NULL COMMENT 'Akses Pengguna, seperti admin, kasih, dll',
  `alamat` text NOT NULL COMMENT 'Alamat pengguna',
  `email` varchar(50) NOT NULL COMMENT 'Email pengguna',
  `no_hp` varchar(12) NOT NULL COMMENT 'Nomor telpon pengguna'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`id_obat`),
  ADD UNIQUE KEY `kode_obat` (`kode_obat`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
